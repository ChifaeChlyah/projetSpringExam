import { Component } from '@angular/core';
import {CaddyService} from "../services/caddy.service";
import {TranslateService} from "@ngx-translate/core";
import {AuthenticationService} from "../services/authentication.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'mypharm-app-front';
 /* constructor(private caddyService:CaddyService) { }
  ngOnInit(): void {
    this.caddyService.loadCaddyFromLocalStorage();
  }*/

  constructor(private translateService:TranslateService,public authService:AuthenticationService) {
    this.translateService.setDefaultLang('fr');
    this.translateService.use(localStorage.getItem('lang')||'fr');
  }
}

