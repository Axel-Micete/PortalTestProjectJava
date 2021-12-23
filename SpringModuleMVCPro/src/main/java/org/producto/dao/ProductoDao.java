package org.producto.dao;

import java.util.List;

import org.producto.modelo.Producto;

public interface ProductoDao {
	public void addProducto(Producto producto);
	public List<Producto> listProducto();
	public Producto getProductoById(Integer id);
	public void deleteProducto(Integer id);

}
