              # SOLID Principles Workshop

このリポジトリーは、SOLID原則を学ぶための講義用教材です。SOLID原則を適用し、設計品質を向上させるコードの実装を体験していただきます。

## 🔥 SOLIDとは？

SOLIDはオブジェクト指向設計の5つの基本原則を表します。これらの原則を守ることで、保守性や拡張性の高いコードを設計できます。

1. **S** - Single Responsibility Principle (単一責任の原則)
    - クラスは単一の責任を持つべきです。
2. **O** - Open/Closed Principle (開放/閉鎖の原則)
    - ソフトウェアは拡張に対して開かれ、変更に対して閉じているべきです。
3. **L** - Liskov Substitution Principle (リスコフの置換原則)
    - サブクラスは、親クラスと置き換えても正しく動作すべきです。
4. **I** - Interface Segregation Principle (インターフェース分離の原則)
    - クライアントは自身が使用しないメソッドに依存してはならない。
5. **D** - Dependency Inversion Principle (依存関係逆転の原則)
    - 高水準モジュールは低水準モジュールに依存すべきではなく、両者は抽象に依存すべきです。

---

## 🚀 課題の進め方
AkiraHouseはそれぞれの部品（B9000,S9000,D9000）を管理するスマートハウスです。  
現在はAkiraHouseの中でそれぞれの部品がインスタンス化されているため、拡張性・保守性が低い状態です。

テストを書き、SOLIDの原則を確認しながら

- SmartHouseTestの１個目のテストが通るようにDIPに則ってリファクタリングしましょう

- smartHouseもinterfaceで仕様を明記し、AkiraHouseはinterfaceで実装しましょう

- 各testを記述し、SOLID原則を意識しながら実装を行い、テストをすべてパスさせてください

このリポジトリーには、以下の内容が含まれます：
1. [実装コード](src/main/kotlin/com/example/xpppp_for_kouhai_devs/smart_home_tdd/right)
2. [テストコード](src/test)
![img.png](img.png)


### 📂 ディレクトリ構造
```
├── src/  ソースコード 
 │ 
 ├── main/  メインコード 
 │   │ 
 │   └── kotlin/ 
 │        │
 │        └── com.example.xpppp_for_kouhai_code/ 
 │            │
 │            ├── dip/ # 依存関係逆転の原則関連 
 │            │
 │            └── smart_home_tdd/ 
 │                │ 
 │                ├── right/  実装ファイル
 │                │   ├── AkiraHouse.kt  スマートほーみゅ
 │                │   ├── B9000.kt  照明
 │                │   ├── D9000.kt  スマートホームディスプレイ
 │                │   ├── Main.kt
 │                │   └── S9000.kt  スイッチ
 │                │
 │                └── wrong/ # 違反例 
 │                    ├── AkiraHouse.kt 
 │                    ├── B9000.kt 
 │                    ├── D9000.kt 
 │                    ├── Main.kt 
 │                    └── S9000.kt 
 └── test/  テストコード 
        │
        └── kotlin/ 
           │ 
           └── com.example.xpppp_for_kouhai_devs.smart_home_tdd 
                ├── SmartHomeTest.kt 
                └── SwitchTest.kt 
```

## 💻 環境構築と実行方法

1. リポジトリーをクローン：
   ```bash
   git clone https://github.com/dig-workshop/XPPPP_5th.git
   cd XPPPP_5th

2. 依存関係をインストール：
   ```bash
    ./gradlew dependencies

3. テストの実行：
   ```bash
    ./gradlew test

## 🙌 貢献

このリポジトリーを改善するためのプルリクエストを歓迎します！  
バグ報告やアイデアもぜひお知らせください。