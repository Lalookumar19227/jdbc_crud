package com.crud.jdbc.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import com.crud.jdbc.project.connection.AdminConnection;
import com.crud.jdbc.project.dto.Product;

public class ProductDao {

	Connection connection = AdminConnection.getConnection();

	private final String DISPLAYPRODUCTQUERY = "select * from product";

	public Product[] displayAllProductDao() {
		try {
			PreparedStatement ps = connection.prepareStatement(DISPLAYPRODUCTQUERY);
			ResultSet resultSet = ps.executeQuery();
			Product[] pd = new Product[7];
			int i = 0;

			while (resultSet.next()) {

				int id = resultSet.getInt("id");

				String name = resultSet.getString("name");
				Double price = resultSet.getDouble("price");
				String color = resultSet.getString("color");
				LocalDate mfg = resultSet.getDate("mgf").toLocalDate();

				LocalDate expd = resultSet.getDate("expd").toLocalDate();

				LocalDate dob = resultSet.getDate("dob").toLocalDate();
				Product product = new Product(id, name, price, color, mfg, expd);
				pd[i] = product;
				i++;

			}
			return pd;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

}
