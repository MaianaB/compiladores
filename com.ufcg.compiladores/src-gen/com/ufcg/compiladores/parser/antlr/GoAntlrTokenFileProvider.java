/*
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GoAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("com/ufcg/compiladores/parser/antlr/internal/InternalGo.tokens");
	}
}
