import { Component, OnInit } from '@angular/core';
import { Book } from '../book';
import { BookService } from '../book.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list',
  standalone: true,
  imports: [],
  templateUrl: './list.component.html',
  styleUrl: './list.component.css'
})
export class ListComponent implements OnInit{
  b: Book[] = [];

  constructor(private bs: BookService, private router: Router){}

  ngOnInit(): void {
    this.getAllBooks();
  }

  private getAllBooks(){
    this.bs.getAllBooks().subscribe(data => {
      this.b = data;
    });
  }

  bookDetails(id: number){
    this.router.navigate(['book-details', id]);
  }
}
