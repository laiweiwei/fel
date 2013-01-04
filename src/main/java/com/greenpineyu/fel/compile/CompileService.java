package com.greenpineyu.fel.compile;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.parser.FelNode;

public class CompileService {
	
	private SourceGenerator srcGen;
	private FelCompiler complier;
	
	public SourceGenerator getSrcGen() {
		return srcGen;
	}

	public void setSrcGen(SourceGenerator srcGen) {
		this.srcGen = srcGen;
	}

	public FelCompiler getComplier() {
		return complier;
	}

	public void setComplier(FelCompiler complier) {
		this.complier = complier;
	}

	{
		srcGen = new SourceGeneratorImpl();
		String name = getCompilerClassName();
		FelCompiler comp = newCompiler(name);
		complier = comp;
	}

	public static List<String> getClassPath(ClassLoader cl) {
		List<String> paths = new ArrayList<String>();
		while (cl != null) {
			boolean isUrlClassloader = cl instanceof URLClassLoader;
			if (isUrlClassloader) {
				URLClassLoader urlClassLoader = (URLClassLoader) cl;
				for (URL url : urlClassLoader.getURLs()) {
					paths.add(url.getFile());
				}
			} else {
				Enumeration<URL> resources = null;
				try {
					resources = cl.getResources("/");
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (resources != null) {
					while (resources.hasMoreElements()) {
						URL resource = resources.nextElement();
						paths.add(resource.getFile());
					}
				}
			}
			cl = cl.getParent();
		}
		return paths;
	}

	private FelCompiler newCompiler(String name) {
		FelCompiler comp = null;
		try {
			@SuppressWarnings("unchecked")
			Class<FelCompiler> cls = (Class<FelCompiler>) Class.forName(name);
			comp = cls.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} finally {
		}
		return comp;
	}

	private String getCompilerClassName() {
		String version = System.getProperty("java.version");
		String compileClassName = FelCompiler.class.getName();
		if (version != null && version.startsWith("1.5")) {
			compileClassName += "15";
		} else {
			compileClassName += "16";
		}
		return compileClassName;
	}
	
	public Expression compile(FelContext ctx, FelNode node, String originalExp) {
		try {
			JavaSource src = srcGen.getSource(ctx, node);
			if (src instanceof ConstExpSrc) {
				ConstExpSrc s = (ConstExpSrc) src;
				return s.getValue();
			}
			src.setSource("// 表达式:" + originalExp + "\n" + src.getSource());
			// System.out.println("****************\n" + src.getSource());
			return complier.compile(src);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.getProperties().list(System.out);
	}

}
