declare
class List
   attr lista

   meth init()
      lista := nil
   end

   meth append(X)
      lista := X | @lista
   end

   meth print_list()
      local Imprimir in
      proc {Imprimir L}
         case L of H|T then
            {Browse H}
            {Imprimir T}
         else
            skip
         end
      end
      {Imprimir @lista}
      end
   end
end

local L in
   L = {New List init()}
   {L append(1)}
   {L append(2)}
   {L print_list()}
end
