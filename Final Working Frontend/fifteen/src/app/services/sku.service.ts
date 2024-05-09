import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Sku} from "../models/sku.model";

@Injectable({
  providedIn: 'root'
})
export class SkuService {

  private apiUrl = 'http://localhost:8082/api/sku/getAll';

  constructor(private http: HttpClient) { }

  getSkus(): Observable<Sku[]> {
    return this.http.get<Sku[]>(this.apiUrl);
  }
}
