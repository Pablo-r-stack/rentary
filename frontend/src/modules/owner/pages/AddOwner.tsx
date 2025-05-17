import DashboardLayout from "@/shared/components/layout/dashboard/DashboardLayout";
import FormAddOwner from "../components/FormAddOwner";

const AddOwner = () => {
  return (
    <DashboardLayout subtitle="Añadir Propietario" redirect="/contact">
      <div className="w-full min-h-screen flex-col bg-white px-6 py-6 rounded-md border mx-6">
        <div className="grid grid-cols-1 md:grid-cols-2 gap-6">
            <p className="text-base font-semibold mb-4">Datos Personales</p>
            <p className="text-base font-semibold mb-4">Documentos</p>
        </div>
        <FormAddOwner />
      </div>
    </DashboardLayout>
  );
};

export default AddOwner;
