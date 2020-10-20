import { Component, OnInit } from '@angular/core';
import { CustService } from '../cust.service';
import { ICust } from '../icust';

@Component({
  selector: 'app-cust-details',
  templateUrl: './cust-details.component.html',
  styleUrls: ['./cust-details.component.css']
})
export class CustDetailsComponent implements OnInit {

  constructor(private _service:CustService) { }

  public cust:ICust;

  ngOnInit(): void {
  }
  public getCustDetails(id:number){
    this._service.getCustById(id).subscribe(data=>this.cust=data);
}

}
