/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patronproxy.access;

import co.unicauca.patronproxy.domain.order.Order;

/**
 *
 * @author Ana Ximena Quijano y Nathalia Ruiz Meneses
 */
public interface IOrderRepository {

    public void createOrder(Order order);
    
}
