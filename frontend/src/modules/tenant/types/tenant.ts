export interface Tenant {
    firstName: string;
    lastName: string;
    dni: string;
    phone?: string;
    email?: string;
    street?: string;
    number?: string;
    city?: string;
    warranty?: string;
    country?: string;
    province?: string;
    postalCode?: string;
    files?: File[];
    attachedDocument?: string;
  }