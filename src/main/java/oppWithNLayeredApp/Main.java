package oppWithNLayeredApp;

import oppWithNLayeredApp.business.ProductManager;
import oppWithNLayeredApp.core.logging.DatabaseLogger;
import oppWithNLayeredApp.core.logging.FileLogger;
import oppWithNLayeredApp.core.logging.Logger;
import oppWithNLayeredApp.dataAccess.HibernateProductDao;
import oppWithNLayeredApp.dataAccess.JdbcProductDao;
import oppWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"macbook air m1",11);
        Logger[] loggers = {new FileLogger(), new DatabaseLogger()};
        ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
        productManager.add(product1);

    }
}