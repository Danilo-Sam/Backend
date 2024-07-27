
package br.com.dsampaio.DAO.generics;

import java.util.HashMap;
import java.util.Map;

/**
 * @author danilo.sampaio
 *
 */
public class SingletonMap {

    private static SingletonMap singletonMap;

    /**
     * Contém todos os registros da aplicação.
     * Simula o banco de dados
     */
    @SuppressWarnings("rawtypes")
    protected Map<Class, Map<?, ?>> map;

    private SingletonMap() {
        map = new HashMap<>();
    }

    /**
     * Método que garante o retorno de apenas uma instância desse objeto
     *
     * @return SingletonMap
     */
    public static SingletonMap getInstance() {
        if (singletonMap == null) {
            singletonMap = new SingletonMap();
        }
        return singletonMap;
    }

    @SuppressWarnings("rawtypes")
    public Map<Class, Map<?, ?>> getMap() {
        return this.map;
    }
}
