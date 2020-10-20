import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ICust } from './icust';

@Injectable({
  providedIn: 'root'
})
export class CustService {

  constructor(private http:HttpClient) { }

  private _baseurl="http://localhost:8080/customer/";

  public getCustById(custId:number):Observable<ICust>{
    return this.http.get<ICust>(this._baseurl+"find/"+custId);
   }

   public custList():Observable<ICust[]>{
    return this.http.get<ICust[]>(this._baseurl);
   }

}
