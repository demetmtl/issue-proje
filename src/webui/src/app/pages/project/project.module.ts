import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ProjectComponent } from './project.component';
import {ProjectRoutingModule} from "./project.routing.module";
import {ProjectService} from "../../services/shared/project.service";




@NgModule({
  imports: [
    CommonModule,
    ProjectRoutingModule
  ],
  declarations: [ProjectComponent],
  providers: [ProjectService]
})
export class ProjectModule { }
