import { Component, OnInit } from '@angular/core';
import { Sku} from "../../models/sku.model";
import { SkuService} from "../../services/sku.service";

@Component({
  selector: 'app-sku-list',
  templateUrl: './sku-list.component.html',
  styleUrls: ['./sku-list.component.css']
})
export class SkuListComponent implements OnInit {

  skus: Sku[] = [];
  constructor(private skuService: SkuService) { }

  ngOnInit() {
    this.loadSkus();
  }

  loadSkus() {
    this.skuService.getSkus().subscribe({
      next: (data) => this.skus = data,
      error: (error) => console.error('THERE WAS AN ERROR!',error)
    });
  }
}
