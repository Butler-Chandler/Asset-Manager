import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { SlimLoadingBarModule} from 'ng2-slim-loading-bar';
import { ReactiveFormsModule } from '@angular/forms';
import { BsDatepickerModule } from 'ngx-bootstrap/datepicker';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AssetAddComponent } from './asset-add/asset-add.component';
import { AssetGetComponent } from './asset-get/asset-get.component';
import { AssetEditComponent } from './asset-edit/asset-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    AssetAddComponent,
    AssetGetComponent,
    AssetEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    SlimLoadingBarModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    BsDatepickerModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
