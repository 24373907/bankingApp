<!DOCTYPE html>

<html lang="en>

    <body>
        <div id="form-container">
        
            <form id="login-info">
                <label for="acc-num">Account Number
                    <input name="accountNumber" id="acc-num" type="number" placeholder="insert account numba">
                </label>

                <label for="password">Password
                    <input name="password" id="password" type="password" placeholder="insert password">
                </label>

                <button type="submit" formmethod="get" formaction="/acc-home">Login</button>
            </form>
        </div>
    </body>
</html>