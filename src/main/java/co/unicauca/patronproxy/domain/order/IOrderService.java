
package co.unicauca.patronproxy.domain.order;

import co.unicauca.patronproxy.access.IOrderRepository;

/**
 *
 * @author Ana Ximena Quijano y Nathalia Ruiz Meneses
 * Suejto(subject).
 * 
 * Interfaz que debe ser implementada tanto por los proxy como por los sijetos que realizan la operacion.
 */
public interface IOrderService {
    
    public void save(IOrderRepository repo);
}
