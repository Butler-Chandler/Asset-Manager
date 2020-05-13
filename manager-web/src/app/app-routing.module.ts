import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AssetAddComponent} from './asset-add/asset-add.component';
import { AssetEditComponent } from './asset-edit/asset-edit.component';
import { AssetGetComponent } from './asset-get/asset-get.component';


const routes: Routes = [
  {
    path: 'asset/create',
    component: AssetAddComponent
  },
  {
    path: 'asset/edit/:id',
    component: AssetEditComponent
  },
  {
    path: 'assets',
    component: AssetGetComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
