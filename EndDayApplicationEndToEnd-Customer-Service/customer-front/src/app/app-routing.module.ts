import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CustDetailsComponent } from './cust-details/cust-details.component';
import { CustListComponent } from './cust-list/cust-list.component';

const routes: Routes = [
  {path:"cust-details",component:CustDetailsComponent},
{path:"cust-list",component:CustListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
