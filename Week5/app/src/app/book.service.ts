import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Book } from "./book";

@Injectable({
    providedIn: 'root'
})
export class BookService{

    private startURL = "http://localhost:8080/api/books";

    constructor (private httpClient: HttpClient) {}

    getAllBooks(): Observable<Book[]>{
        return this.httpClient.get<Book[]>(`${this.startURL}`);
    }

    createBook(b: Book): Observable<Object>{
        return this.httpClient.post(`${this.startURL}`, b);
    }

    getBookId(id: number): Observable<Book>{
        return this.httpClient.get<Book>(`${this.startURL}/${id}`);
    }

    updateBook(id: number, b: Book): Observable<Object>{
        return this.httpClient.put(`${this.startURL}/${id}`, b);
    }

    deleteBook(id: number): Observable<Object>{
        return this.httpClient.delete(`${this.startURL}/${id}`);
    }
}