import 'package:flutter/material.dart';

void main() {
  runApp(MainApp());
}

class MainApp extends StatelessWidget {
  Widget build(BuildContext context) {
    return MaterialApp(home: const HomePage());
  }
}

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage>{
  int count = 0;

  void decrement() {
    setState(() {
      count = --count == 0 ? 0 : count ;
    });
  }

  void increment() {
    setState(() {
      count = ++count > 20 ? 20 : count;
    });
  }
  void zerar() {
    setState(() {
      count = 0;
    });
  }
  void encher() {
    setState(() {
      count = 20;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.black,
      body: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Text(
            count == 20 ? "Está Cheio" : (count == 0 ? "Está Vazio" :"Pode entrar"),
            style: TextStyle(
              fontSize: 26,
              color: Colors.white,
              fontWeight: FontWeight.bold
            )
          ),
          Text('$count', style: TextStyle(fontSize: 100, color: Colors.white)),
          Row(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              TextButton(
                onPressed: count == 0 ? null : decrement, 
                style: TextButton.styleFrom(
                  backgroundColor: Colors.blue,
                  padding: EdgeInsets.all(16),
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(8),
                  ),
                ),
                child: Text('Saiu', style: TextStyle(color: Colors.white)),
              ),
              SizedBox(width: 32),
              TextButton(
                onPressed: count == 20 ? null : increment,
                style: TextButton.styleFrom(
                  backgroundColor: Colors.blue,
                  padding: EdgeInsets.all(16),
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(8),
                  ),
                ),
                child: Text('Entrou', style: TextStyle(color: Colors.white)),
              ),
            ], // children
          ),
          SizedBox(height: 16),
          TextButton(
            onPressed: zerar,
            style: TextButton.styleFrom(
              backgroundColor: Colors.blue,
              padding: EdgeInsets.all(16),
              shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(8),
              ),
            ),
            child: Text('Zerar', style: TextStyle(color: Colors.white))
          ),
          SizedBox(height: 16),
          TextButton(
            onPressed: encher,
            style: TextButton.styleFrom(
              backgroundColor: Colors.blue,
              padding: EdgeInsets.all(16),
              shape: RoundedRectangleBorder(
                borderRadius: BorderRadius.circular(8),
              ),
            ),
            child: Text('Preencher', style: TextStyle(color: Colors.white))
          ),
        ],
      ),
      appBar: AppBar(
        title: Text("Texto do AppBar"),
      ),
      drawer: Drawer(), // sidebar
    );
  }
}
