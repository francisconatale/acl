program S;
var
  p: ^integer;
  q: ^integer;

begin
  new(p);
  p^:= 100;
  new(q);
  q^:= 200;
  p:=q;
  writeln(p^);
end.
