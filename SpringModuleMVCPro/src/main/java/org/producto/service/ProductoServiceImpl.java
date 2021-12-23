package org.producto.service;

import java.util.List;

import org.producto.dao.ProductoDao;
import org.producto.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl  implements ProductoService{
	
	@Autowired
	private ProductoDao dao;

	@Transactional
	public void addProducto(Producto producto) {
		// TODO Auto-generated method stub
		dao.addProducto(producto);
		
	}

	@Transactional
	public List<Producto> listProducto() {
		// TODO Auto-generated method stub
		return dao.listProducto();
	}

	@Transactional
	public Producto getProductoById(Integer id) {
		// TODO Auto-generated method stub
		return dao.getProductoById(id);
	}

	@Transactional
	public void deleteProducto(Integer id) {
		dao.deleteProducto(id);
		
	}
	

}
