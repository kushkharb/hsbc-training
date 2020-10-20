import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CustDetailsComponent } from './cust-details/cust-details.component';
import { CustListComponent } from './cust-list/cust-list.component';
import { CustService } from './cust.service';

@NgModule({
  declarations: [
    AppComponent,
    CustDetailsComponent,
    CustListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [CustService],
  bootstrap: [AppComponent]
})
export class AppModule { }
