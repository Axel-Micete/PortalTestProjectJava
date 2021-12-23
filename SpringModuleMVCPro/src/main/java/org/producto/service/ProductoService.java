package org.producto.service;

import java.util.List;

import org.producto.modelo.Producto;

public interface ProductoService {
	
	public void addProducto(Producto producto);
	public List<Producto> listProducto();
	public Producto getProductoById(Integer id);
	public void deleteProducto(Integer id);

}
