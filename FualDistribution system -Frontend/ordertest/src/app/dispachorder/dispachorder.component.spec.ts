import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DispachorderComponent } from './dispachorder.component';

describe('DispachorderComponent', () => {
  let component: DispachorderComponent;
  let fixture: ComponentFixture<DispachorderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DispachorderComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DispachorderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
