import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app.routing.module';
import { AppComponent } from './app.component';
import {IssueModule} from "./pages/issue/issue.module";
import {ProjectModule} from "./pages/project/project.module";
import {DashboardModule} from "./pages/dashboard/dashboard.module";
import {AppLayoutComponent, FooterComponent, HeaderComponent, SidebarComponent} from "../_layout";

@NgModule({
  declarations: [
    AppComponent,
    AppLayoutComponent,
    FooterComponent,
    HeaderComponent,
    SidebarComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    IssueModule,
    ProjectModule,
    DashboardModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
