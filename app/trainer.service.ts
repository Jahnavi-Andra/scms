import { Injectable } from '@angular/core';
import { Http , Response} from '@angular/http';
import { Observable } from 'rxjs';
import'rxjs/add/operator/map';
import { Sport } from './sport';
import { Trainer } from './trainer';
import { Trainingcamp } from './trainingcamp';

@Injectable({
  providedIn: 'root'
})
export class TrainerService {

  validate(user:string,pass:string): Observable<Trainer> {
    return this.http.get
    ("http://localhost:7549/trainerapi/trainer/"+user+"/"+pass)
      .map((res: Response) => res.json());
  }

  validatecount(user:string,pass:string): Observable<string> {
    return this.http.get
    ("http://localhost:7549/trainerapi/trainer/auth/"+user+"/"+pass)
      .map((res: Response) => res.text());
  }

    //full camp details
    showCampFull(): Observable<Trainingcamp[]> { 
      return this.http.get
      ("http://localhost:7549/camp/getAll")
         .map((res: Response) => res.json());
    }
  //camp by Id
    showCampById(id : number): Observable<Trainingcamp> {
      return this.http.get("hhttp://localhost:7549/camp/getAll/"+ id)
         .map((res: Response) => res.json());
        
    }
  
    //showPendingStudentList
    showPendingStudentList(TrainerId : number): Observable<Trainingcamp[]> { 
      return this.http.get
      ("http://localhost:7549/camp/pendingStudentList/" + TrainerId)
         .map((res: Response) => res.json());
    }

    showtrainerById(sportId : number): Observable<Trainer[]> { 
      return this.http.get
      ("http://localhost:7549/camp/trainerbysport/" + sportId)
         .map((res: Response) => res.json());
    }
  
  
    //ListOfStudents -- who have status acc/pending
    listOfStudents(TrainerId : number): Observable<Trainingcamp[]>{ 
      return this.http.get
      ("http://localhost:7549/camp/listOfStudents/" + TrainerId)
         .map((res: Response) => res.json());
    }
  
    //Student enroll info
  
    studentEnrollInfo(studId : number): Observable<Trainingcamp>{ 
      return this.http.get
      ("http://localhost:7549/camp/studentEnrollInfo/" + studId)
         .map((res: Response) => res.json());
    }
  
     // get stud id by trainer id 
     selectStudId(TrainerId : number): Observable<number[]>{ 
      return this.http.get
      ("http://localhost:7549/camp/selectStudId/" + TrainerId)
         .map((res: Response) => res.json());
    }
//selectDojbyStudId
    selectDojbyStudId(studId : number): Observable<string>{ 
      return this.http.get
      ("http://localhost:7549/camp/dojByStudId/"+ studId)
         .map((res: Response) => res.text());
    }

  
       // UpdateStatus
       UpdateStatus(status : String, StudId : number , TrainerId : number ): Observable<string>{ 
        return this.http.put
        ("http://localhost:7549/camp/updateStatus/" + status + "/" + StudId + "/" +TrainerId,null)
           .map((res: Response) => res.text());
      }
  
  
      
       // Enroll 
       Enroll(Traincamp : Trainingcamp ): Observable<string>{ 
        return this.http.post
        ("http://localhost:7549/camp/EnrollInsert/" , Traincamp)
           .map((res: Response) => res.text());
      }

      
  
//selectDojbyStudId
         selectSportgroup(): Observable<Sport[]>{ 
        return this.http.get
            ("http://localhost:7549/camp/sportGroup")
               .map((res: Response) => res.json());
} 
  constructor(private http :Http) { }
}
