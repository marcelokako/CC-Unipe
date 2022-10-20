// C++ code
//
void setup()
{
  pinMode(13, OUTPUT);
}

void loop()
{
  int LedVerde = 13;
  int LedAmarelo = 12;
  int LedVermelho = 2;
  digitalWrite(LedVerde, HIGH);
  delay(2000); // Wait for 1000 millisecond(s)
  digitalWrite(LedVerde, LOW);
  
  digitalWrite(LedAmarelo, HIGH);
  delay(1000); // Wait for 1000 millisecond(s)
  digitalWrite(LedAmarelo, LOW);
  
  digitalWrite(LedVermelho, HIGH);
  delay(3000); // Wait for 1000 millisecond(s)
  digitalWrite(LedVermelho, LOW);
}
