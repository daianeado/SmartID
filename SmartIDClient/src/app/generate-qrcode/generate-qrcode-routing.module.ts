import { GenerateQrCodeComponent } from './generate-qrcode.component';
import { GenerateQrCodeResolver } from './generate-qrcode-resolver.service';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {
    path: '',
    component: GenerateQrCodeComponent,
    resolve: {
      isAuthenticated: GenerateQrCodeResolver
    }
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class GenerateQrCodeRoutingModule {}
