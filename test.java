public static double priceCal (int Use) {
    double Price = 0;
    if(Use > 0) {
        Price = 40;
    }
    if(Use > 100) {
        if(Use <= 200) {
            Price = Price + (Use - 100) * 0.5;
        }
        else {
            Price = Price + 50 + (Use - 200) * 0.1;
            if(Price >= 100) {
                Price = Price * 0.9;
            }
        }
    }
    return Price;
}