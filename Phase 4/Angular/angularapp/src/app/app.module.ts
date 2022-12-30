import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ShoppingComponent } from './shopping/shopping.component';
import { TemplateformexampleComponent } from './templateformexample/templateformexample.component';
import { FormsModule }   from '@angular/forms';
import { ReactiveformexampleComponent } from './reactiveformexample/reactiveformexample.component';
import { ReactiveFormsModule } from '@angular/forms';
import { ValidtemplateformComponent } from './validtemplateform/validtemplateform.component';

@NgModule({
  declarations: [
    AppComponent,
    ShoppingComponent,
    TemplateformexampleComponent,
    ReactiveformexampleComponent,
    ValidtemplateformComponent,
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }