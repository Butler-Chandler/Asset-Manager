import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';


@Component({
  selector: 'app-asset-add',
  templateUrl: './asset-add.component.html',
  styleUrls: ['./asset-add.component.css']
})
export class AssetAddComponent implements OnInit {
  types: any = ['Microphone','Laptop','Keyboard']
  angForm: FormGroup;
  date = new Date();

  constructor(private fb: FormBuilder) {
    this.createForm();
  }

  createForm(){
    this.angForm = this.fb.group({
      Description: ['', Validators.required],
      Location: ['', Validators.required],
      Manufactuer: ['', Validators.required],
      Price: ['', Validators.required],
      Warranty: ['', Validators.required],
      Type: ['', Validators.required]
    })
  }

  public saveDate(date: Date){
    console.log(date);
  }

  ngOnInit(): void {
  }

}
