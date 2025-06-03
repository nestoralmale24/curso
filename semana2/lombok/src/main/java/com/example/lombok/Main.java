package com.example.lombok;

import com.example.lombok.decoradores.MasMenosPeso;
import com.example.lombok.model.Tienda;

public class Main {
	public static void main(String[] args) {
		Tienda tienda = new Tienda();
		MasMenosPeso aumentarCliente1 = new MasMenosPeso(20, "nestor", 10);

		tienda.agregarCliente(aumentarCliente1);

		System.out.println(tienda.obtenerPesosClientes());

		var masPeso = aumentarCliente1.aumentaPeso(aumentarCliente1.getPeso());
		var menosPeso = aumentarCliente1.disminuyePeso(masPeso);

		System.out.println(menosPeso);

	}
}
