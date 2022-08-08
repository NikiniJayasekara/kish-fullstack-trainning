import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';


@Component({
  selector: 'app-placeorder',
  templateUrl: './placeorder.component.html',
  styleUrls: ['./placeorder.component.scss']
})
export class PlaceorderComponent implements OnInit {

  constructor(private http:  HttpClient) { }
  orderForm = new FormGroup({
    name: new FormControl(''),
    id: new FormControl(''),
    Fual: new FormControl(''),
    Cap: new FormControl(''),
  });
 
  preview: string = '';
 
  ngOnInit(): void {}


 
  
 
  save() {
    this.preview = JSON.stringify(this.orderForm.value);
  }
  submitOrderCreate(order:{Id:number,fualType:String,capacity:number}){
 console.log(order)
 this.http.post('http://localhost:8081/order', order, {responseType:'text' as 'json'})
     .subscribe((res)=>{
  console.log(res);
 });

}
}