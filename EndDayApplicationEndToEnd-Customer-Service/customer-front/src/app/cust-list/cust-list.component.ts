import { Component, OnInit } from '@angular/core';
import { CustService } from '../cust.service';
import { ICust } from '../icust';

@Component({
  selector: 'app-cust-list',
  templateUrl: './cust-list.component.html',
  styleUrls: ['./cust-list.component.css']
})
export class CustListComponent implements OnInit {

  constructor(private _service:CustService) { }

  public custList:ICust[]=[];

  ngOnInit(): void {
  }

  public getCustList(){
    this._service.custList().subscribe(data=>this.custList=data);
  }

}
