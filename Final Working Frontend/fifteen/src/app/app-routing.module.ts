  import { NgModule } from '@angular/core';
  import { RouterModule, Routes } from '@angular/router';
  import { SkuListComponent} from "./components/sku-list/sku-list.component";

  const routes: Routes = [
    { path: 'skus', component: SkuListComponent },
    { path: '', redirectTo: '/skus', pathMatch: 'full' }
  ];

  @NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })
  export class AppRoutingModule { }
