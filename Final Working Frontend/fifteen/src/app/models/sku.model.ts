export class Sku {
  sku_no: number;
  product_name: string;
  product_category: string;
  product_price: number;  // Assuming you're handling currency as a float for simplicity in frontend
  stock_level: number;
  stock_update_date: Date;  // Using Date to handle dates in TypeScript

  constructor(
    sku_no: number,
    product_name: string,
    product_category: string,
    product_price: number,
    stock_level: number,
    stock_update_date: Date
  ) {
    this.sku_no = sku_no;
    this.product_name = product_name;
    this.product_category = product_category;
    this.product_price = product_price;
    this.stock_level = stock_level;
    this.stock_update_date = new Date(stock_update_date);
  }
}
