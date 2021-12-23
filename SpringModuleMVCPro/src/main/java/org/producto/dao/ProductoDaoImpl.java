package org.producto.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.producto.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoDaoImpl implements ProductoDao{
	
	@Autowired
	private SessionFactory SessionFactory;
	
	@Override
	public void addProducto(Producto producto) {
		try {
			SessionFactory.getCurrentSession().saveOrUpdate(producto);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception:" +e.getMessage());
		}
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> listProducto() {
		// TODO Auto-generated method stub
		List<Producto> list = null;
		try {
			list = (List<Producto>)
		    SessionFactory.getCurrentSession().createQuery("from Producto").list();

		    
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
		return list;
	}

	@Override
	public Producto getProductoById(Integer id) {
		Producto producto = null;
		try {
			producto = (Producto) SessionFactory.getCurrentSession().get(Producto.class, id);
		} catch (Exception e) {
			System.out.println("Exception" + e.getMessage());
		}
		return producto;
	}

	@Override
	public void deleteProducto(Integer id) {
		Producto producto = null;
		try {
			producto = (Producto) SessionFactory.getCurrentSession().get(Producto.class, id);
			SessionFactory.getCurrentSession().delete(producto);
		} catch (Exception e) {
			System.out.println("Exception" + e.getMessage());
		}
		
		
	}
	

	
}
