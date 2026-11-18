public class PrintProduct {
    public void printTotal(IProduct p){
        System.out.println("TOTAL PRODUCT SALES: " + p.GetTotalProductSold());

    }
    public void printAverage(IProduct p){
        System.out.println("AVERAGE PRODUCTS SOLD: %.Of%n"+ p.GetAverageProductSold());
    }
    public void printPopular(IProduct p){
        System.out.println("MOST POPULAR PRODUCTS: " + p.GetMostPopularProduct());
    }
}
