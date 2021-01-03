import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListofStudentsComponent } from './listof-students.component';

describe('ListofStudentsComponent', () => {
  let component: ListofStudentsComponent;
  let fixture: ComponentFixture<ListofStudentsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListofStudentsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListofStudentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
