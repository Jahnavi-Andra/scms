import { Injectable } from '@angular/core';
import { Http , Response} from '@angular/http';
import { Observable } from 'rxjs';
import'rxjs/add/operator/map';
import { Sport } from './sport';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  validate(user:string,pass:string): Observable<Student> {
    return this.http.get
    ("http://localhost:7549/studentapi/student/"+user+"/"+pass)
      .map((res: Response) => res.json());
  }

  validatecount(user:string,pass:string): Observable<number> {
    return this.http.get
    ("http://localhost:7549/studentapi/student/auth/"+user+"/"+pass)
      .map((res: Response) => res.json());
  }

  studentById(id:number): Observable<Student> {
    return this.http.get
    ("http://localhost:7549/studentapi/student/"+id)
      .map((res: Response) => res.json());
  }

  updatePoints(points:number,id:number): Observable<string> {
    return this.http.put
    ("http://localhost:7549/studentapi/studentpoints/"+points+"/"+id,null)
      .map((res: Response) => res.text());
  }

  updateWallet(fee:number,id:number): Observable<string> {
    return this.http.put
    ("http://localhost:7549/studentapi/studentwallet/"+fee+"/"+id,null)
      .map((res: Response) => res.text());
  }

  register(student:Student): Observable<string> {
    return this.http.post
    ("http://localhost:7549/studentapi/student",student)
      .map((res: Response) => res.text());
  }

  allSports(): Observable<Sport[]> {
    return this.http.get
    ("http://localhost:7549/sportapi/sport")
      .map((res: Response) => res.json());
  }

  sportfeeById(id:number): Observable<number> {
    return this.http.get
    ("http://localhost:7549/sportapi/sport/"+id)
      .map((res: Response) => res.json());
  }

  sportByTrainerId(id:number): Observable<Sport> {
    return this.http.get
    ("http://localhost:7549/sportapi/sportbytrainerid/"+id)
      .map((res: Response) => res.json());
  }

  trainerBySportId(id:number): Observable<Sport[]> {
    return this.http.get
    ("http://localhost:7549/sportapi/trainerinfo/"+id)
      .map((res: Response) => res.json());
  }

  constructor(private http :Http) { }
}
