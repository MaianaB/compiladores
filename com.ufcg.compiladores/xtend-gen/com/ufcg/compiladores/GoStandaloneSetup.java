/**
 * generated by Xtext 2.13.0
 */
package com.ufcg.compiladores;

import com.ufcg.compiladores.GoStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class GoStandaloneSetup extends GoStandaloneSetupGenerated {
  public static void doSetup() {
    new GoStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}