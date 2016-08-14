package pe.egcc.app.service.impl;

import pe.egcc.app.service.espec.MateServiceEspec;

public class MateServiceImpl implements MateServiceEspec{

  @Override
  public int sumar(int n1, int n2) {
    return (n1+n2);
  }

  @Override
  public long factorial(int n) {
    return 0;
  }
  
}
