package main
import "fmt"

type Retangulo struct {
	comprimento, largura float64
}

func (r Retangulo) calcularArea() float64 {
	return r.comprimento * r.largura
}

func (r Retangulo) calcularPerimetro() float64 {
	return (2*r.comprimento)+(2*r.largura)
}

func main(){
	ret := Retangulo{200,300}
	fmt.Printf("Area: %.2f\n", ret.calcularArea())
	fmt.Printf("Perímetro: %.2f\n", ret.calcularPerimetro())
}
