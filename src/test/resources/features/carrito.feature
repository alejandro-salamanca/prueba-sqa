Feature: Validar Carro de Compras
  Yo como usuario
  Quiero utilizar mi carro de compras
  Para realizar mis compras

  @CarroCompra
  Scenario: Seleccionar dos productos para agregarlos al carro de compras
    Given Usuario ingresa a Pagina de Amazon
    When Usuario agrega 2 productos al carro de compras
    Then Usuario ve correctamente 2 productos en el carro compras
