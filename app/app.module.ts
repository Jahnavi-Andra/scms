import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { StudentLoginComponent } from './student-login/student-login.component';
import { TrainerLoginComponent } from './trainer-login/trainer-login.component';
import { StudentSignupComponent } from './student-signup/student-signup.component';
import { StudentDashboardComponent } from './student-dashboard/student-dashboard.component';
import { TrainerDashboardComponent } from './trainer-dashboard/trainer-dashboard.component';
import { StudentInfoComponent } from './student-info/student-info.component';
import { TrainerInfoComponent } from './trainer-info/trainer-info.component';
import { AvailableSportsComponent } from './available-sports/available-sports.component';
import { EnrollComponent } from './enroll/enroll.component';
import { ListofStudentsComponent } from './listof-students/listof-students.component';
import { AcceptRejectComponent } from './accept-reject/accept-reject.component';
import { UpdatePointsComponent } from './update-points/update-points.component';
import { RouterModule, Routes } from '@angular/router';
import {​​​​​​​​ HttpModule }​​​​​​​​ from'@angular/http';
import { NgxPageScrollModule } from 'ngx-page-scroll';
// import { NgxPageScrollCoreModule } from 'ngx-page-scroll-core';
const appRoutes : Routes = [
  {path :'studentdashboard', component:StudentDashboardComponent,
  children :
  [
    {path:'studentinfo', component:StudentInfoComponent, outlet:'student'},
    {path : 'availsport', component: AvailableSportsComponent, outlet:'student'},
    {path : 'enroll', component:EnrollComponent, outlet:'student'},
  ]
  },
  {path :'trainerdashboard', component:TrainerDashboardComponent,
  children :
  [
    {path:'trainerinfo', component:TrainerInfoComponent, outlet:'trainer'},
    {path : 'list', component: ListofStudentsComponent, outlet:'trainer'},
    {path : 'acrej', component:AcceptRejectComponent, outlet:'trainer'},
    {path : 'updatepoints', component:UpdatePointsComponent, outlet:'trainer'},
  ]
  },
  {path : 'default', component:HomeComponent,
  children :
  [
  //  {path : 'studentlogin', component:StudentLoginComponent},
  //  {path : 'trainerlogin', component:TrainerLoginComponent},
  //  {path : 'aboutus', component:AboutusComponent, outlet:'data'},
  ]
  },
  {path : '', component:HomeComponent},
  {path : 'register', component:StudentSignupComponent},
  {path : 'studentlogin', component:StudentLoginComponent},
  {path : 'trainerlogin', component:TrainerLoginComponent},
  {path : 'aboutus', component:AboutusComponent},
]

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AboutusComponent,
    StudentLoginComponent,
    TrainerLoginComponent,
    StudentSignupComponent,
    StudentDashboardComponent,
    TrainerDashboardComponent,
    StudentInfoComponent,
    TrainerInfoComponent,
    AvailableSportsComponent,
    EnrollComponent,
    ListofStudentsComponent,
    AcceptRejectComponent,
    UpdatePointsComponent,
  ],
  imports: [
    BrowserModule,FormsModule,
    HttpModule,
    RouterModule.forRoot(appRoutes),
    NgxPageScrollModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
