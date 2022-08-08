import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule}  from '@angular/common/http' 
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PlaceorderComponent } from './placeorder/placeorder.component';
import { DispachorderComponent } from './dispachorder/dispachorder.component';
import { CheckStatusComponent } from './check-status/check-status.component';

@NgModule({
  declarations: [
    AppComponent,
    PlaceorderComponent,
    DispachorderComponent,
    CheckStatusComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
