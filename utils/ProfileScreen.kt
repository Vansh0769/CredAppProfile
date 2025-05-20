package com.example.cred.utils

import RewardsAndBenefitsSection
import TransactionAndSupport
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
                contentDescription = "Back Icon",
                tint = Color.White
            )
            Spacer(modifier = Modifier.width(8.dp))
            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Profile",
                color = Color.White,
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.weight(1f)) // pushes Support card to the end
            SupportButton()


        }

        Spacer(modifier = Modifier.height(24.dp))
        ProfileHeader()
        Spacer(modifier = Modifier.height(24.dp))
        ProfileStats()
        Spacer(modifier = Modifier.height(24.dp))
        RewardsAndBenefitsSection()
        HorizontalDivider()
        TransactionAndSupport()
    }
}





@Composable
fun SupportButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Surface(
        modifier = modifier
            .wrapContentSize()
            .height(36.dp)
            .clickable { onClick() },
        shape = CircleShape,
        border = ButtonDefaults.outlinedButtonBorder,
        color = Color.Transparent
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(horizontal = 12.dp, vertical = 6.dp)
        ) {
            Icon(
                imageVector = Icons.Default.MailOutline,
                contentDescription = "Support Icon",
                tint = Color.Gray,
                modifier = Modifier.size(16.dp)
            )

            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = "Support",
                color = Color.Gray,
                fontSize = 14.sp
            )
        }
    }
}
