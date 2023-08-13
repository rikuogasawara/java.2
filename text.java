<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8" />
    </head>
    <body>
        <h1>form test</h1>
        <!-- form 要素 -->
        <form action="/form/send" method="POST">
            お名前 <input type="text" name="name"><br>
            誕生日 <input type="date" name="birthday"><br>
            emailアドレス <input type="email" name="email"><br>
            性別 <label><input type="radio" name="gender" value="0">無回答</label>
                 <label><input type="radio" name="gender" value="1">男性</label>
                 <label><input type="radio" name="gender" value="2">女性</label>
                 <br>
            趣味 <label><input type="checkbox" name="hobby" value="1">スポーツ</label>
                 <label><input type="checkbox" name="hobby" value="2">読書</label>
                 <label><input type="checkbox" name="hobby" value="3">ゲーム</label>
                 <label><input type="checkbox" name="hobby" value="4">料理</label>
                 <label><input type="checkbox" name="hobby" value="5">食</label>
                 <label><input type="checkbox" name="hobby" value="6">旅行</label>
                 <br>

            <button>送信する</button>
        </form>
    </body>
</html>